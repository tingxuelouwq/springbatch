package com.kevin.springbatch.ch02;

import org.springframework.batch.item.ItemProcessor;

/**
 * @类名: CreditBillProcessor
 * @包名：com.kevin.springbatch.ch02
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/6/17 11:18
 * @版本：1.0
 * @描述：
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {
    @Override
    public CreditBill process(CreditBill item) throws Exception {
        System.out.println(item.toString());
        return item;
    }
}
