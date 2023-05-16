package hello.itemservice.domain.item;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10,000원 넘게 입력해주세요")
public class Item {

//	@NotNull(groups = UpdateCheck.class) // 수정 요구사항
    private Long id;
    
//    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;
    
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min = 1000, max = 1000000)
    private Integer price;
    
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = {SaveCheck.class}) // 수정 요구사항
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}