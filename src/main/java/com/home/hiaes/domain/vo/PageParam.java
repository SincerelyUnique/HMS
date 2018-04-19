
package com.home.hiaes.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * <code>PageParam</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 20:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParam implements Serializable {

    private static final long serialVersionUID = 6297178964005032338L;
    public static final int DEFAULT_PAGE_NUM = 1;
    public static final int DEFAULT_NUM_PER_PAGE = 15;
    public static final int MAX_PAGE_SIZE = 10000;

    private int pageNum = 1;
    private int numPerPage;

}
