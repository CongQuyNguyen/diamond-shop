package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.dto.PaginateDTO;
import com.congquy.diamondshop.service.IPaginateService;
import org.springframework.stereotype.Service;

@Service
public class PaginateService implements IPaginateService {

    private int getInfoTotalPage(int totalData, int limit) {
        int totalPage = 0;
        totalPage = totalData / limit;
        totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
        return totalPage;
    }

    public int checkCurrentPage(int currentPage, int totalPage) {
        if (currentPage < 1) {
            return 1;
        }
        if (currentPage > totalPage) {
            return totalPage;
        }
        return currentPage;
    }

    private int findEnd(int start, int limit, int totalData) {
        return (start + limit) > totalData ? totalData : (start + limit) - 1;
    }

    private int findStart(int currentPage, int limit) {
        return ((currentPage - 1) * limit) + 1;
    }

    @Override
    public PaginateDTO getInfoPaginate(int totalData, int limit, int currentPage) {
        PaginateDTO paginate = new PaginateDTO();

        // totalPage lấy từ việc tính toán
        int totalPage = getInfoTotalPage(totalData, limit);


        // Tìm vị trí bắt đầu và kết thúc của một trang (số của item trang đó)
        int start = findStart(currentPage, limit);
        int end = findEnd(start, limit, totalData);

        // currentPage lấy từ param request yêu cầu
        paginate.setCurrentPage(checkCurrentPage(currentPage, totalPage));
        paginate.setTotalPage(totalPage);
        paginate.setLimit(limit);
        paginate.setEnd(end);
        paginate.setStart(start);
        return paginate;
    }
}
