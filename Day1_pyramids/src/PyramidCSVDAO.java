import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class PyramidCSVDAO implements PyramidDAO {
    List<Pyramid> Pyramids;
    String[] fields;
    
    public PyramidCSVDAO(){
//        File pyramid_file = new File(rowFileName);
    }

    
    @Override
    public  List<Pyramid> readPyramidsFromCSV(String row_file){
        this.Pyramids = new ArrayList<Pyramid>();
        //acess the data from csv file
        File pyramid_file = new File(row_file);
        
        //read all data lines from csv file and save them in alist
        List <String> lines = new ArrayList<String>();
        
        try{
            lines = Files.readAllLines(pyramid_file.toPath());    
        } catch (Exception ex) {
            System.out.println("An issue happen while reading from file "+ex);
        }
        //extract all pyramids info and save them in a list
        for (int lineIdx=1; lineIdx < lines.size(); lineIdx++){
            String line =lines.get(lineIdx);
            String[] fields = line.split(",");
            for(int fieldIndex =0; fieldIndex < fields.length; fieldIndex++){
                fields[fieldIndex] = fields[fieldIndex].trim(); 
            }
            Pyramid Pyramid = new Pyramid(fields[0],fields[2],fields[4],fields[7]);
            Pyramids.add(Pyramid);
        }

        return Pyramids;
    }
    
}