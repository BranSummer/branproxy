package org.bran.branproxy.util;

/**
 * @author lizhle
 */
public interface BaseBitSet extends Cloneable, java.io.Serializable{
    /**
     * 在布隆过滤器中设置一个单独的位,默认值是true。
     *
     * @param bitIndex bit index.
     */
     void set(int bitIndex);

    /**
     * 在布隆过滤器中设置一个单独的位,默认值是true/false。
     *
     * @param bitIndex bit index.
     * @param value    value true or false.
     */
     void set(int bitIndex, boolean value);

    /**
     * 返回用于存储在布隆过滤器中的位集合。
     *
     * @param bitIndex bit index.
     * @return the bit set used to store the Bloom filter.
     */
     boolean get(int bitIndex);

    /**
     * 清除当前索引的位集合，同样在这个索引的位集合值为false
     *
     *
     * @param bitIndex bit index.
     */
     void clear(int bitIndex);

    /**
     * 清除位集合，同样位集合所有值为false
     */
     void clear();

    /**
     *
     * @return the number of bits in the Bloom filter.
     */
     long size();

    /**
     *
     * @return is the bit set empty.
     */
     boolean isEmpty();

}
