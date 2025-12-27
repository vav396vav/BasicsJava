package classes_and_methods_9.lombok;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"name", "price"})
public class ProductLombok {
    private final String name;
    private final double price;
    private int stock;

}
