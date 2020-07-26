package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users", schema = "security")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "listRole")
public class UserSecurity {

    @Id
    @GenericGenerator(name = "uuid_userid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_userid")

    @Column(name = "user_id", nullable = false, unique = true, length = 64)
    private String id;
    @Column(name = "username", nullable = false, unique = true, length = 150)
    private String nama;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "is_active", nullable = false)
    private Boolean active;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @Column(name = "created_by", length = 50)
    private String createdBy;

    @OneToMany
    @JoinTable(name = "user_roles", schema = "security",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false)
    )
    private List<RoleSecurity> listRole = new ArrayList<>();

}
