package io.github.ahogek.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import io.github.ahogek.pay.pojo.PayInfo;

import java.math.BigDecimal;

public interface IPayService {

    /**
     * 创建/发起支付
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知处理
     */
    String asyncNotify(String notifyData);

    /**
     * 通过订单号查询支付记录
     */
    PayInfo queryByOrderId(String orderId);
}
