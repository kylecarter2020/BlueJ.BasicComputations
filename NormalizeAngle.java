 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        angle = (angle + 360) % 360;
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer + 360, 360);
    }

    public static void main(String[] args){

    }
}
