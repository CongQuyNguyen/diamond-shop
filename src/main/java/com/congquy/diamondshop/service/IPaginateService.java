package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.PaginateDTO;

public interface IPaginateService {
    PaginateDTO getInfoPaginate(int totalData, int limit, int currentPage);
}
