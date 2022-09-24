package com.example.fish.logic.network.model

import java.util.ArrayList

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
    var addr: String,
    var appIsShare: Int,
    var appKey: String,
    var avatar: Any,
    var content: String,
    var createTime: String,
    var id: String,
    var imageCode: String,
    var imageUrlList: List<Any>,
    var price: String,
    var status: Int,
    var tUserId: String,
    var tuserId: String,
    var typeId: Int,
    var typeName: String,
    var username: String
)

/**
 * goods/save and goods/add
 */
data class SaveResponse(
    val code: Int,
    val `data`: SaveData,
    val msg: String
)

data class SaveData(
    val addr: String,
    val avatar: Any,
    val content: String,
    val createTime: String,
    val id: String,
    val imageCode: String,
    val imageUrlList: List<Any>,
    val price: Int,
    val status: Int,
    val tUserId: String,
    val tuserId: String,
    val typeId: Int,
    val typeName: String,
    val username: String
)

/**
 * goods/delete
 */
data class DeleteResponse(
    val msg:String,
    val code: Int,
    val data: String
)
/**
 * goods/add
 */
data class AddResponse(
    val code: Int,
    val `data`: AddData,
    val msg: String
)

data class AddData(
    val addr: String,
    val avatar: Any,
    val content: String,
    val createTime: String,
    val id: String,
    val imageCode: String,
    val imageUrlList: List<Any>,
    val price: Int,
    val status: Int,
    val tUserId: String,
    val tuserId: String,
    val typeId: Int,
    val typeName: String,
    val username: String
)
/**
 * goods/upload
 */
data class UploadResponse(
    val code: Int,
    val `data`: UploadData,
    val msg: String
)

data class UploadData(
    val imageCode: String,
    val imageUrlList: List<String>
)

/**
 * goods/save get
 */
data class SaveListResponse(
    val code: Int,
    val `data`: SaveListData,
    val msg: String
)

data class SaveListData(
    val current: Int,
    val records: List<SaveListRecord>,
    val size: Int,
    val total: Int
)

data class SaveListRecord(
    var addr: String,
    var appIsShare: Int,
    var appKey: String,
    var avatar: String,
    var content: String,
    var createTime: String,
    var id: String,
    var imageCode: String,
    var imageUrlList: List<String>,
    var price: String,
    var status: Int,
    var tUserId: String,
    var tuserId: String,
    var typeId: Int,
    var typeName: String,
    var username: String
)

