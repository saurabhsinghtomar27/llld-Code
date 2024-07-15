public class PlayingPieces {
    public PiecesType type;
    PlayingPieces(PiecesType type){
        this.type = type;
    }
    public String toString(){
        return type.toString();
    }   
}
