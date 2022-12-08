package com.bookMyShowAPI.BMS.dto.ResponseDto;

import com.bookMyShowAPI.BMS.enums.TheaterType;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {

    @NotNull
    int id;

    String name;

    String address;

    String city;

    TheaterType theaterType;
}
