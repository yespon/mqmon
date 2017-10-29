package com.yespon.mqmon.entity;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/29
 */
public class Queue {
    private String queueName;
    private long currentQueueDepth;
    private long inputCount;
    private long outputCount;
    private boolean UncommittedMessages;
    private boolean QueueMonitoring;
    private String MediaRecoveryLogExtentName;


}
