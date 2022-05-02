public class MediaPlayerAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMidia){
        if(!tipoMidia.equals(TipoMedia.MP3)){
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }


    @Override
    public void reproduzir(TipoMedia tipoMidia, String nomeArquivo) {
        if(tipoMidia.equals(TipoMedia.VLC)){
            advancedMediaPlayer.reproduzirVlc(nomeArquivo);
        }else if (tipoMidia.equals(TipoMedia.MP4)){
            advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        }
    }
}
