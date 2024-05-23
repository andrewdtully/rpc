public static void main(String[] args) {

    //Row 1: 1=hearts, 2=diamonds, 3=spades, 4=clubs
    //Row 2: 1-10=1-10, 11=jack, 12=queen, 13=king, 14=ace

    int nextSuit, nextCard, x, y;
    boolean duplicate = false;
    int [][] cardHand = new int [7][2];

    for( x=0;x<7;x++){
        nextSuit = (int)(Math.random()*4+1);
        nextCard = (int)(Math.random()*14+1);
        //the probsably needs to be a while??
        //for(int y=0; x<7; y++){
        y=0;
        while (y<7){
            //check both row 1 and 2 for duplicates elsewhere in the hand
            if(cardHand[0][y]==nextSuit && cardHand[1][y]==nextCard){
                duplicate = true;
            }
        y++;
        }
        
        if(duplicate==false){
            //insert the next card ints, check this

        }
    }


}
    

