package com.inspo.solutions.inspobeerinventoryservice.web.mappers;

import com.inspo.solutions.inspobeerinventoryservice.domain.BeerInventory;
import com.inspo.solutions.inspobeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
