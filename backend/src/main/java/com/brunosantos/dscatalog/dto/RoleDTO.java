package com.brunosantos.dscatalog.dto;

import com.brunosantos.dscatalog.entities.Role;

public record RoleDTO(Long id, String authority) {

    public RoleDTO(Role role) {
        this(role.getId(), role.getAuthority());
    }
}
