package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Mosen on 2017/11/28.
 */
@Controller
public class ValidatorController {
    @Autowired
    private Validator validator;

    @RequestMapping(value = "/apply", method = {POST})
    public void regist(@RequestBody Person person) {
        System.out.println(person);
        Errors errors = new MapBindingResult(new HashMap<String,String>(),"person");
        validator.validate(person, errors);
        System.out.println(errors);
    }

    @RequestMapping(value = "/apply", method = {POST})
    public void regist(@Valid @RequestBody Person person, BindingResult result) {
        System.out.println(person);
        System.out.println(result);
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError error: list){
                //System.out.println(error.getObjectName());
                //System.out.println(error.getArguments()[0]);
                System.out.println(error.getDefaultMessage());//验证信息
            }
        }
    }
}
