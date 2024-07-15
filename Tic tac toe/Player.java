public class Player {
    public String name;
    public PlayingPieces playingPieces;
    public Player(String name, PlayingPieces playingPieces){
        this.name = name;
        this.playingPieces = playingPieces;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public PlayingPieces getPlayingPieces(){
        return playingPieces;
    }
    public void setPlayingPieces(PlayingPieces playingPieces){
        this.playingPieces = playingPieces;
    }
}
