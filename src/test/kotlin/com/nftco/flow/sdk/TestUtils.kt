package com.nftco.flow.sdk

object TestUtils {

    fun newMainnetAccessApi(): FlowAccessApi = Flow.newAccessApi(MAINNET_HOSTNAME)

    fun newTestnetAccessApi(): FlowAccessApi = Flow.newAccessApi(TESTNET_HOSTNAME)

    fun newSandboxAccessApi(): FlowAccessApi = Flow.newAccessApi(SANDBOXNET_HOSTNAME)

    fun newPreviewAccessApi(): FlowAccessApi = Flow.newAccessApi(PREVIEWNET_HOSTNAME)

    val MAINNET_HOSTNAME = "access.mainnet.nodes.onflow.org"
    val TESTNET_HOSTNAME = "access.devnet.nodes.onflow.org"
    val SANDBOXNET_HOSTNAME = "access.sandboxnet.nodes.onflow.org"
    val PREVIEWNET_HOSTNAME = "access.previewnet.nodes.onflow.org"
}
