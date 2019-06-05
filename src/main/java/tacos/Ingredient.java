package tacos;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ingredient {

  private final String id;
  private String name;
  private Type type;
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
