/* *
 * @author Administrator
 * @create 2018/7/28
 */
package com.wang.simplesb.controller;

import com.wang.simplesb.bean.Girl;
import com.wang.simplesb.Service.GirlService;
import com.wang.simplesb.dao.Girlrespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {
    public List<Girl> girlList;
    @Autowired
    private Girlrespon girlrespon;
    @Autowired
    private GirlService girlService;
    /*查询女生列表*/
    @GetMapping(value = "/getGirl")
    public List<Girl> getGirlList(){
        return  girlrespon.findAll();
    }
  /*  添加女孩*/
    @PostMapping(value = "/potGirl")
    public Girl addGirl(@Valid Girl girl1, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()){
            System.out.println("=========errr=r======");
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
            Girl girl=new Girl();
            girl.setAge(girl1.getAge());
            girl.setCupsize(girl1.getCupsize());
        return  girlrespon.save(girl);
    }

    //查询一个女孩
   @GetMapping(value = "/getGirl/{id}")
    public  Girl getOne(@PathVariable("id")  Integer ids) {
        System.out.println("hdsfkjbcjhsabjhvajvsdjvahvhjjav"+girlrespon.getOne(ids));
        Girl girl=girlrespon.getOne(ids);
       System.out.println("girl_id"+girl.getId());
       System.out.println("girl_age"+girl.getAge());
       return girl;
   }
  @PutMapping(value ="/putGirl/{id}")
    public  Girl  updegirl(
            @PathVariable("id") Integer id,
            @RequestParam("cupsize") String  cupsize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupsize(cupsize);
        girl.setAge(age);
       return girlrespon.save(girl);

  }
    @DeleteMapping(value ="/cutGirl/{id}")
        public  Integer delete(@PathVariable("id") Integer id){
                girlrespon.deleteById(id);
                return id ;
        }
        @GetMapping(value = "/getAge/{age}")
        public List<Girl>  findByAge(@PathVariable  Integer age){
               return girlrespon.findByAge(age);
        }
    @PostMapping(value = "/put")
    public  void girltwo(){
        girlService.inserto();
    }
}

