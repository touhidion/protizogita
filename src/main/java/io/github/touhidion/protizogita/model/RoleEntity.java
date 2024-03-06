package io.github.touhidion.protizogita.model;

import io.github.touhidion.protizogita.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "_role")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role name;

    @ManyToMany(mappedBy = "roles")
    private Collection<UserEntity> users;
}
