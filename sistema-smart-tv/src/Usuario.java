public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal : " + smartTv.canal);

        smartTv.mudarDeCanal(13);

        System.out.println("Canal : " + smartTv.canal);

        smartTv.ligar();

        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

    }
}
