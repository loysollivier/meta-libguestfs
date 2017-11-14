DESCRIPTION = "libguestfs python bindings from http://libguestfs.org/guestfs-python.3.html#using-python-bindings-in-a-virtualenv"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "http://download.libguestfs.org/1.36-stable/libguestfs-${PV}.tar.gz"
SRC_URI[md5sum] = "1777414488c8444a84640adedeed0a4d"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/libguestfs-${PV}"

# cdrtools depends for genisoimage

DEPENDS = " \
    augeas \
    cdrtools-native \
    gperf-native \
    qemu \
    perl \
    libpcre \
    glibc \
    flex \
    file \
    gettext \
    yajl \
    bison \
    ncurses \
    po4a \
    cpio \
    libxml2 \
    xz \
"

RDEPENDS_${PN} = " \
    augeas \
    gperf \
    qemu \
    perl \
    libpcre \
    glibc \
    flex \
    file \
    gettext \
    yajl \
    bison \
    ncurses \
    po4a \
    cpio \
    libxml2 \
    xz \
"

inherit autotools pkgconfig
