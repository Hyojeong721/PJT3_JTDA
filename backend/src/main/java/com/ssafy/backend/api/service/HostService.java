package com.ssafy.backend.api.service;

import com.ssafy.backend.api.dto.response.HostListRes;
//import com.ssafy.backend.core.domain.HostList;

//import java.util.List;

public interface HostService {

//    List<HostList> getHostList(String startAt, String endAt);
//
//    List<HostList> getHostSearch(String query);

    HostListRes getHostSearch(String startAt, String endAt, String query);
}