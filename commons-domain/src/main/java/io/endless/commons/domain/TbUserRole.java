package io.endless.commons.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_user_role")
public class TbUserRole {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户 ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    private Long roleId;
}