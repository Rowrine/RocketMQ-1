/**
 * $Id: MessageListenerConcurrently.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.client.consumer.listener;

import java.util.List;

import com.alibaba.rocketmq.common.MessageExt;


/**
 * ͬһ���е���Ϣ��������
 * 
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public interface MessageListenerConcurrently extends MessageListener {
    /**
     * �����׳��쳣��ͬ�ڷ��� ConsumeConcurrentlyStatus.RECONSUME_LATER
     * 
     * @param msgs
     * @param context
     * @return
     */
    public ConsumeConcurrentlyStatus consumeMessage(final List<MessageExt> msgs,
            final ConsumeConcurrentlyContext context);
}