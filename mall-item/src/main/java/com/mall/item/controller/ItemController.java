package com.mall.item.controller;

import com.mall.common.model.Result;
import com.mall.item.domain.OrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.item.controller
 * @date 2021/3/11 17:43
 * @description
 */
@Api(tags = "商品中心系统")
@RestController
@RequestMapping("/item")
public class ItemController {

    private static final Logger log = LoggerFactory.getLogger(ItemController.class);

    @ApiOperation(value = "获取订单信息")
    @GetMapping("/{itemId}")
    public Result<OrderInfo> getOrderInfo(@PathVariable("itemId") String itemId,
                               @RequestHeader(value = "name", required = false) String name) {
        log.info("获取到请求头名称为name的值：" + name);

        log.info("-----------------itemApp-1------------------");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setItemId(itemId);
        orderInfo.setItemName("iPhone 12 pro max");
        orderInfo.setPrice(5288L);
        return Result.ok(orderInfo);
    }
}
