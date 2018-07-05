package app;

import static app.mp3Player.Slider1; //%%%%%%%%%%%
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;





public class MainClass 
{
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    
    public Player player;
    
    public long pauselocation;
    public long songTotalLength;
    
     public int pauselocation2=0;
    public int songTotalLength2;
    
    public String fileLocation;
    
    public void Stop(){
        
        if(player != null){
            player.close();
            
           // mp3Player.display.setText("");
        }
    }
    
    public void Play(String path){
        
        try {
            
            FIS = new FileInputStream(path);
            
            BIS = new BufferedInputStream(FIS);
            
            
            player = new Player(BIS);
            
        
            songTotalLength = FIS.available();
            
            System.out.println(songTotalLength);
            
            songTotalLength2 =  (int) ((songTotalLength/100000)) ;
            
            SliderPlay();
            
            
            fileLocation = path + "";
            
             
        }
        catch (FileNotFoundException | JavaLayerException ex) {
           
        }
        catch (IOException ex){
            
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    //SliderPlay();
                    Slider1.setValue(0);
                    SliderPlay();
                    player.play();
                   // SliderPlay();
                } 
                catch (JavaLayerException ex) {
                    
                }
            }
    }.start();
        
    }
    
  
    
    public void Pause(){
        
        if(player != null){
            
            try {
                
                pauselocation = FIS.available();
                
                pauselocation2 =  (int) ((pauselocation/100000)) ;
                
                player.close();
            } 
            catch (IOException ex) {
               
            }
        }
    }
    
       public void SliderPlay()
    {
        
        for(int i=0;i<songTotalLength2;i=i+1){
            Slider1.setValue(i);
        }
    }
    
     public void Resume(){
        
        try {
            
            FIS = new FileInputStream(fileLocation);
            
            BIS = new BufferedInputStream(FIS);
            
            
            player = new Player(BIS);
            
            FIS.skip(songTotalLength - pauselocation);
             
        }
        catch (FileNotFoundException | JavaLayerException ex) {
           
        } catch (IOException ex) {
           
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } 
                catch (JavaLayerException ex) {
                    
                }
            }
    }.start();
        
    }
     
     
     public void ForwardPlay(){
        
        try {
            
            FIS = new FileInputStream(fileLocation);
            
            BIS = new BufferedInputStream(FIS);
            
            
            player = new Player(BIS);
            

            long  sl = (songTotalLength)/20;
            
            FIS.skip(songTotalLength - pauselocation + sl);
             
        }
        catch (FileNotFoundException | JavaLayerException ex) {
           
        } catch (IOException ex) {
           
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } 
                catch (JavaLayerException ex) {
                    
                }
            }
    }.start();
        
     }
     
     
      public void BackwardPlay(){
        
        try {
            
            FIS = new FileInputStream(fileLocation);
            
            BIS = new BufferedInputStream(FIS);
            
            
            player = new Player(BIS);
            

            long  sl = (songTotalLength)/20;
            
            FIS.skip(songTotalLength - pauselocation - sl);
             
        }
        catch (FileNotFoundException | JavaLayerException ex) {
           
        } catch (IOException ex) {
           
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } 
                catch (JavaLayerException ex) {
                    
                }
            }
    }.start();
        
    }
      
  
    
    
}
