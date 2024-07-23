package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.dto.PaginateDTO;
import com.congquy.diamondshop.service.IPaginateService;

public class PaginateService implements IPaginateService {

    private int getTotalPage(int totalData, int limit) {
        int totalPage = 0;
        totalPage = totalData / limit;
        totalPage = totalData * limit < totalData ? totalPage + 1 : totalPage;
        return totalPage;
    }

    @Override
    public PaginateDTO getInfoPaginate(int totalData, int limit, int currentPage) {
        PaginateDTO paginate = new PaginateDTO();

        int totalPage = getTotalPage(totalData, limit);
        paginate.setTotalPage(totalPage);

        paginate.setLimit(limit);
        paginate.setCurrentPage(currentPage);

        return paginate;
    }
}
