package org.imesh.sample.employee.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Employee {

    /**
     */
    @NotNull
    private String employeeId;

    /**
     */
    private String name;

    /**
     */
    private String address;

    /**
     */
    private String email;
}
