package validator;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by Mosen on 2017/11/28.
 */
public class Person implements Serializable {

    @NotNull(message = "用户名称不能为空")
    private String name;

    @Max(value = 100, message = "年龄不能大于100岁")
    @Min(value = 18, message = "必须年满18岁！")
    private int age;

    //必须是ture
    @AssertTrue(message = "bln4 must is true")
    private boolean bln;

    //必须是false
    @AssertFalse(message = "blnf must is falase")
    private boolean blnf;

    @DecimalMax(value = "100", message = "decim最大值是100")
    private int decimax;

    @DecimalMin(value = "100", message = "decim最小值是100")
    private int decimin;

    // @Length(min=1,max=5,message="slen长度必须在1～5个字符之间")
    private String slen;

    @NotNull(message = "身份证不能为空")
    @Pattern(regexp = "^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$", message = "身份证格式错误")
    private String iDCard;

    @NotNull(message = "密码不能为空")
    private String password;
    @NotNull(message = "验证密码不能为空")
    private String rpassword;

    @Digits(integer= 3 ,fraction= 2 )
    private Double price;


    /**
    @AssertTrue   //用于boolean字段，该字段只能为true

    @AssertFalse //该字段的值只能为false

    @CreditCardNumber //对信用卡号进行一个大致的验证

    @DecimalMax //只能小于或等于该值

    @DecimalMin //只能大于或等于该值

    @Digits(integer= 2 ,fraction= 20 ) //检查是否是一种数字的整数、分数,小数位数的数字。

    @Email //检查是否是一个有效的email地址

    @Future //检查该字段的日期是否是属于将来的日期

    @Length(min=,max=) //检查所属的字段的长度是否在min和max之间,只能用于字符串

    @Max //该字段的值只能小于或等于该值

    @Min //该字段的值只能大于或等于该值

    @NotNull //不能为null

    @NotBlank //不能为空，检查时会将空格忽略

    @NotEmpty //不能为空，这里的空是指空字符串

    @Null //检查该字段为空

    @Past //检查该字段的日期是在过去

    @Size(min=, max=) //检查该字段的size是否在min和max之间，可以是字符串、数组、集合、Map等

    @URL(protocol=,host,port) //检查是否是一个有效的URL，如果提供了protocol，host等，则该URL还需满足提供的条件

    @Valid //该注解只要用于字段为一个包含其他对象的集合或map或数组的字段，或该字段直接为一个其他对象的引用，

    //这样在检查当前对象的同时也会检查该字段所引用的对象

    */


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
