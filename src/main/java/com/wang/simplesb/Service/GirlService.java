/* *
 * @author Administrator
 * @create 2018/8/1
 */
package com.wang.simplesb.Service;

import com.wang.simplesb.bean.Girl;
import com.wang.simplesb.dao.Girlrespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
   private Girlrespon girlrespon;

@Transactional
    public void inserto(){
        Girl girl1=new Girl();
        girl1.setAge(23);
        girl1.setCupsize("B");
        girlrespon.save(girl1);
        Girl girl2=new Girl();
        girl2.setAge(25);
        girl2.setCupsize("CC");
        girlrespon.save(girl2);
    }
}
