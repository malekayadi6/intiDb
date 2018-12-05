package com.dhm.initDb.repositories.user.entities;

import org.springframework.data.annotation.Id;

public class Permission {

    @Id
    private String id;

    private ModuleAction name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModuleAction getName() {
        return name;
    }

    public void setName(ModuleAction name) {
        this.name = name;
    }

    public Permission(String id, ModuleAction name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Permission() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Permission other = (Permission) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name != other.name)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Permission [id=" + id + ", name=" + name + "]";
    }


}
