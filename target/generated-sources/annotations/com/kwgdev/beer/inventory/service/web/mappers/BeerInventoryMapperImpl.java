package com.kwgdev.beer.inventory.service.web.mappers;

import com.kwgdev.beer.inventory.service.domain.BeerInventory;
import com.kwgdev.brewery.model.BeerInventoryDto;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-29T01:03:55-0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        BeerInventory beerInventory = new BeerInventory();

        beerInventory.setId( beerInventoryDTO.getId() );
        beerInventory.setCreatedDate( dateMapper.asTimestamp( beerInventoryDTO.getCreatedDate() ) );
        beerInventory.setLastModifiedDate( dateMapper.asTimestamp( beerInventoryDTO.getLastModifiedDate() ) );
        beerInventory.setBeerId( beerInventoryDTO.getBeerId() );
        beerInventory.setUpc( beerInventoryDTO.getUpc() );
        beerInventory.setQuantityOnHand( beerInventoryDTO.getQuantityOnHand() );

        return beerInventory;
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDto beerInventoryDto = new BeerInventoryDto();

        beerInventoryDto.setId( beerInventory.getId() );
        beerInventoryDto.setCreatedDate( dateMapper.asOffsetDateTime( beerInventory.getCreatedDate() ) );
        beerInventoryDto.setLastModifiedDate( dateMapper.asOffsetDateTime( beerInventory.getLastModifiedDate() ) );
        beerInventoryDto.setBeerId( beerInventory.getBeerId() );
        beerInventoryDto.setUpc( beerInventory.getUpc() );
        beerInventoryDto.setQuantityOnHand( beerInventory.getQuantityOnHand() );

        return beerInventoryDto;
    }
}
