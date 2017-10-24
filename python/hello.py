#! /usr/bin/env python
# -*- coding: utf-8 -*-
import pymysql
import contextlib
from pyspark import SparkContext, SparkConf


# psutil==5.3.1
# py4j==0.10.4
# PyMySQL==0.7.11
# pyspark==2.2.0
# virtualenv==15.1.0

@contextlib.contextmanager
def mysql(host='192.168.1.56', port=3306, user='root', passwd='123456', db='ejavashop', charset='utf8'):
    conn = pymysql.connect(host=host, port=port, user=user, passwd=passwd, db=db, charset=charset)
    cursor = conn.cursor(cursor=pymysql.cursors.DictCursor)
    try:
        yield cursor
    finally:
        conn.commit()
        cursor.close()
        conn.close()


def f(i, iterator): yield (i, sum(iterator))


def sample(sc):
    # sample
    x = sc.parallelize(range(30))
    # call 'sample' 5 times
    ylist = [x.sample(withReplacement=False, fraction=0.5) for i in range(10)]
    print('x = ' + str(x.collect()))
    for cnt,y in zip(range(len(ylist)), ylist):
        print('sample:' + str(cnt) + ' y = ' +  str(y.collect()))


def take_sample(sc):
    # takeSample
    x = sc.parallelize(range(7))
    # call 'sample' 5 times
    ylist = [x.takeSample(withReplacement=False, num=3) for i in range(5)]
    print('x = ' + str(x.collect()))
    for cnt,y in zip(range(len(ylist)), ylist):
        print('sample:' + str(cnt) + ' y = ' +  str(y))  # no collect on y


def union(sc):
    # 取并集
    x = sc.parallelize(['A','A','B'])
    y = sc.parallelize(['D','C','A'])
    z = x.union(y)
    print(x.collect())
    print(y.collect())
    print(z.collect())


def intersection(sc):
    # 取交集
    x = sc.parallelize(['A','A','B'])
    y = sc.parallelize(['A','C','D'])
    z = x.intersection(y)
    print(x.collect())
    print(y.collect())
    print(z.collect())


def sort_by_key(sc):
    #按键排序
    x = sc.parallelize([('B',1),('A',2),('C',3)])
    y = x.sortByKey()
    print(x.collect())
    print(y.collect())


def glom_test(sc):
    x = sc.parallelize(range(16),4)
    print(x.glom().collect())

def cartesian(sc):
    # 迪卡尔积
    x = sc.parallelize(['A','B'])
    y = sc.parallelize(['C','D'])
    z = x.cartesian(y)
    print(x.collect())
    print(y.collect())
    print(z.collect())

def grooup_by(sc):
    x = sc.parallelize([1,2,3,4,5,9])
    y = x.groupBy(lambda x: 'A' if(x%2==1)  else 'B')
    print(x.collect())
    print([(j[0],[i for i in j[1]]) for j in y.collect()])

def zip_demo():
    a = [1,2,3]
    b = [4,5,6]
    print(list(zip(a,b)))

def sort_by(sc):
    x = sc.parallelize(['Cat','Apple','Bat'])
    y = x.sortBy(lambda x: x[0])
    print(y.collect())

def histogram(sc):
    # 桶和分布
    x = sc.parallelize([1,3,2,2,3,7,5,10])
    y = x.histogram(buckets = 3)
    print(x.collect())
    print(y)

if __name__ == '__main__':
    conf = SparkConf().setAppName("Demo").setMaster("local[4]")
    sc = SparkContext(conf=conf)
    histogram(sc)
