package com.ssafy.eureka.domain.card.dto.response;

import com.ssafy.eureka.domain.card.dto.CardCompanyEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardCompanyListResponse {
    private List<CardCompanyEntity> cardCompanyList;
}
