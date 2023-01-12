public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novocanal){
        canal = novocanal;
    }
    
    public void ligar(){
        ligada = true;

    }

    public void desligar(){
        ligada = false;
        
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("aumentando o volume para"  + volume);
        
    }
    
    public void diminuirVolume(){

        volume --;
        System.out.println("diminuindo o volume para " + volume);
    }
    
    public void aumentarCanal(){
        canal ++;
    }
    public void diminnuirCanal(){
        canal --;
    }
}
