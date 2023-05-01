public class Area {
    int length, width, height;
    public Area(){
        length = 5;
        width = 3;
        height = 6;
    }
    int ansVolume(){

        int result = length * width * height;
//        return length * width * height;
        return result;
    }
    int ansArea(){
        return length + width + height;
    }
}
