package com.dhm.initDb.repositories.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PrimaryModel implements Serializable {

    @Id
    private String id;

    private String value;

    @Override
    public String toString() {
        return "PrimaryModel{" + "id='" + id + '\'' + ", value='" + value + '\''
                + '}';
    }
}
