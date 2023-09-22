package pshyeok2.legendpipeline.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;


import pshyeok2.legendpipeline.dto.SummonerDTO;
import pshyeok2.legendpipeline.service.SummonerService;

@Controller
@RequiredArgsConstructor
public class SummonerController {

    private final SummonerService summonerService;

    @PostMapping(value = "/summonerByName")
    @ResponseBody
    public SummonerDTO callSummonerByName(String summonerName){

        summonerName = summonerName.replaceAll(" ","%20");

        SummonerDTO apiResult = summonerService.callRiotAPISummonerByName(summonerName);

        return apiResult;
    }


}