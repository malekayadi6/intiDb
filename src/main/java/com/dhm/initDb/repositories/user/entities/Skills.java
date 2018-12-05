package com.dhm.initDb.repositories.user.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document
@Data
@AllArgsConstructor
public class Skills {

    @Id
    private String id;
    private String name;
    @DBRef(lazy = true)
    private List<User> users;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skills)) return false;
        Skills skills = (Skills) o;
        return Objects.equals(id, skills.id) &&
                Objects.equals(name, skills.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    public Skills() {

    }
}
