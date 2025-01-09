package com.brigada.is.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlbumRequestDTO {
    private String name; //Поле не может быть null, Строка не может быть пустой

    private Integer tracks; //Поле не может быть null, Значение поля должно быть больше 0

    private int length; //Значение поля должно быть больше 0

    private long sales; //Значение поля должно быть больше 0
}
