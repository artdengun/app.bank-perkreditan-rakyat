package com.deni.gunawan.app.bankperkreditanrakyat.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "roles", schema = "security")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleSecurity {

    @Id
    @SequenceGenerator(name = "role_security_seq",
    schema = "security",
    initialValue = 1,
    allocationSize = 1,
    sequenceName = "role_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_security_seq")
    @Column(name = "role_id", nullable = false, unique = true)
    private Long id;
    @Column(name ="rolename", nullable = false, unique = true, length = 20)
    private String nama;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @Column(name = "created_by", length = 50)
    private String createdBy;
}
