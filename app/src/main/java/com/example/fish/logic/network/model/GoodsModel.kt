package com.example.fish.logic.network.model

/**
 * @author:SunShibo
 * @date:2022-09-10 18:22
 * @feature:
 */

/**
 * goods/type
 */
data class GoodTypeResponse(
    val code: Int,
    val `data`: List<TypeData>,
    val msg: String
)

data class TypeData(
    val id: Int,
    val type: String
)

/** goods/all */
data class GoodAllResponse(
    val code: Int,
    val `data`: AllData,
    val msg: String
)

data class AllData(
    val current: Int,
    val records: List<Record>,
    val size: Int,
    val total: Int
)

data class Record(
    val addr: String,
    val appKey: String,
    val avatar: String,
    val content: String,
    val createTime: Int,
    val id: Int,
    val imageCode: Int,
    val imageUrlList: List<ImageUrl>?,
    val price: Int,
    val status: Int,
    val tUserId: Int,
    val tuserId: Int,
    val typeId: Int,
    val typeName: String,
    val username: String
)
class ImageUrl