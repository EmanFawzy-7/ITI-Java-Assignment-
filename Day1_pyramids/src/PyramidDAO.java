import java.util.List;
public interface PyramidDAO {
	List<Pyramid> readPyramidsFromCSV(String row_file);
}
