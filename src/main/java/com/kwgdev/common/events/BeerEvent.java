package com.kwgdev.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * created by kw on 1/3/2021 @ 1:01 PM
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor // Jackson wants a no args constructor to function properly
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -791324981724981L;

    private BeerDto beerDto;
}
