import java.util.ArrayList;
public class GeometricObjSet {
    
    private ArrayList<GeometricObj> GeoSet;
    public GeometricObjSet(){
        GeoSet=new ArrayList<GeometricObj>();
    }
    public int getObjCount(){
        return GeoSet.size();
    }
    public double getTotalArea(){
        double TotalArea=0;
        for(GeometricObj c:GeoSet){
            TotalArea=TotalArea+c.getArea();
        }
        return TotalArea;
    }
    public double getMaxCircumstance(){
        double MaxCircumstance=0;
        for(GeometricObj c:GeoSet){
            if(c.getCircumstance()>MaxCircumstance){
                MaxCircumstance=c.getCircumstance();
            }
        }
        return MaxCircumstance;
    }
    public void add(GeometricObj x){
        GeoSet.add(x);
    }
    public String toString(){
        if(getObjCount()>0){
        for(GeometricObj c:GeoSet){
                if(c.getClass().getName()=="Rectangle"){
                    System.out.println((Rectangle)c+"\n"+"Area:"+c.getArea()+"\t"+"Circumstance:"+c.getCircumstance());
                }
                if(c.getClass().getName()=="Circle"){
                    System.out.println((Circle)c+"\n"+"Area:"+c.getArea()+"\t"+"Circumstance:"+c.getCircumstance());
                }
                if(c.getClass().getName()=="Triangle"){
                    System.out.println((Triangle)c+"\n"+"Area:"+c.getArea()+"\t"+"Circumstance:"+c.getCircumstance());
                }
            }
        }
        else{
            System.out.println("no members");
        }
        
        return "";
    } 
    }
    
