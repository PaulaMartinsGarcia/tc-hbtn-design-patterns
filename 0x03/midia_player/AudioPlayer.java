public class AudioPlayer implements MediaPlayer{

    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(TipoMedia tipoMidia, String nomeArquivo) {
        if(tipoMidia.equals(TipoMedia.MP3)) {
            System.out.print("Reproduzindo MP3: " + nomeArquivo);
        } else {
            mediaPlayerAdapter = new MediaPlayerAdapter(tipoMidia);
            mediaPlayerAdapter.reproduzir(tipoMidia, nomeArquivo);
        }
    }
}
