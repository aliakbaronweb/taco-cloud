package tacos;
import java.util.List;

// tag::allButValidation[]
import lombok.Data;

@Data
public class Taco {

  private String name;
  
  private List<String> ingredients;

}