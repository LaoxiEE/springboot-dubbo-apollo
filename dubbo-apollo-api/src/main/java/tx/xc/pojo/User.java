package tx.xc.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String pwd;
    private int age;
    private String sex;

}
